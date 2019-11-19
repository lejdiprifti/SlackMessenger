import fetch from 'node-fetch'
const template = document.createElement('template')
template.innerHTML = `
<main>
<input id="username" placeholder="Username" type="text" required />
<input id="password" placeholder="Password" type="text" required />
<p class="hidden">Username or password is not correct.</p>
<button id="submit">Login</button>
</main>
`

class LoginBoard extends window.HTMLElement {
  constructor () {
    super()

    this.attachShadow({ mode: 'open' })
    this.shadowRoot.appendChild(template.content.cloneNode(true))
  }

  connectedCallback () {
    this.token = 'SomeToken'
  }

  loginUser () {
    const submit = document.querySelector('submit')
    submit.addEventListener('click', async _event => {
      const username = document.body.querySelector('username').value
      const password = document.body.querySelector('password').value
      const response = await fetch('http://localhost:8080/login', {
        method: 'POST',
        headers: {
          'Content-type': 'application/json'
        },
        body: JSON.stringify({
          username: username,
          password: password
        })
      }).catch(_error => {
        document.body.querySelectorAll('.hidden')[0].classList.remove('hidden')
      })
      const answer = await response.json()
      answer.setToken(answer.token)
    })
  }

  setToken (token) {
    this.token = token
  }

  getToken () {
    return this.token
  }
}

window.customElements.define('login-board', LoginBoard)
