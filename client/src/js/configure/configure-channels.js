import { getToken } from '../login/loginboard.js'
const template = document.createElement('template')
template.innerHTML = `
<div id="channelsDiv">
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
    this.getChannels()
  }

  async getChannels () {
    const submit = this.shadowRoot.querySelector('#submit')
    const input = this.shadowRoot.querySelector('#input')
    console.log(getToken())
    submit.addEventListener('click', async event => {
      const response = await fetch('http://localhost:8080/channels', {
        method: 'POST',
        headers: {
          'Content-type': 'application/json',
          Authorization: 'Bearer ' + getToken()
        },
        body: JSON.stringify({
          channelId: input.value
        })
      })
      console.log(response)
    })
  }
}

window.customElements.define('configure-channels', ConfigureChannels)
