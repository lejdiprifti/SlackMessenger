import { getToken } from '../login/loginboard.js'
const template = document.createElement('template')
template.innerHTML = `
<link rel="stylesheet" href="../../css/configure/configure.css" />
<div id="channelsDiv">
<div id="channels"> 
<template>
<p></p>
</template>
</div>
<label>Add channels</label>
<input id="input" type="text" placeholder="Channel" required/>
<input id="submit" type="submit" value="Add" />

</div>
`

export class ConfigureChannels extends window.HTMLElement {
  constructor () {
    super()

    this.attachShadow({ mode: 'open' })
    this.shadowRoot.appendChild(template.content.cloneNode(true))
  }

  connectedCallback () {
    this.addChannels()
    this.getChannels()
  }

  async addChannels () {
    const submit = this.shadowRoot.querySelector('#submit')
    const input = this.shadowRoot.querySelector('#input')
    console.log(getToken())
    submit.addEventListener('click', async event => {
      await fetch('http://localhost:8080/channels', {
        method: 'POST',
        headers: {
          'Content-type': 'application/json',
          Authorization: 'Bearer ' + getToken()
        },
        body: JSON.stringify({
          channelId: input.value
        })
      })
      this.getChannels()
    })
  }

  async getChannels () {
    this.shadowRoot.querySelectorAll('p').forEach(obj => {
      obj.innerHTML = ''
    })
    const response = await fetch('http://localhost:8080/channels', {
      method: 'GET',
      headers: {
        'Content-type': 'application/json',
        Authorization: 'Bearer ' + getToken()
      }
    })
    const answer = await response.json()
    let paragraph = null
    const template = this.shadowRoot.querySelector('#channels template').content
    const channels = document.importNode(template, false)
    answer.forEach(obj => {
      paragraph = document.importNode(template.firstElementChild, true)
      paragraph.innerText = obj.channelId
      channels.appendChild(paragraph)
    })
    this.shadowRoot.querySelector('#channels').appendChild(channels)
  }
}

window.customElements.define('configure-channels', ConfigureChannels)
