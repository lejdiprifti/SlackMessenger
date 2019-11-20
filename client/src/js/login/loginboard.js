import '../configure/configure-channels.js'
const template = document.createElement('template')
template.innerHTML = `
<link rel="stylesheet" href="../../css/login/login.css" />
<div>
<input id="username" placeholder="Username" type="text" required />
<input id="password" placeholder="Password" type="password" required />
<p class="hidden">Username or password is not correct.</p>
<input type="submit" id="submit" value="Login" />
<input type="submit" id="register" value="Sign up" />
</div>
`
let token = 'SomeToken'
export class LoginBoard extends window.HTMLElement {
  constructor () {
    super()

    this.attachShadow({ mode: 'open' })
    this.shadowRoot.appendChild(template.content.cloneNode(true))
  }

  connectedCallback () {
    window.location.hash = 'login'
    this.loginUser()
    this.onRegister()
  }

  loginUser () {
    const submit = this.shadowRoot.querySelector('#submit')
    console.log(submit)
    submit.addEventListener('click', async _event => {
      window.location.href = 'http://localhost:4000/#login'
      const username = this.shadowRoot.querySelector('#username').value
      const password = this.shadowRoot.querySelector('#password').value
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
        console.log('error')
      })
      const answer = await response.json()
      setToken(answer.jwt)
      this.shadowRoot.innerHTML = ''
      this.shadowRoot.appendChild(document.createElement('configure-channels'))
    })
  }

  onRegister () {
    const register = this.shadowRoot.querySelector('#register')
    register.addEventListener('click', event => {
      window.location.href = 'https://slack.com/oauth/authorize?client_id=832604726948.833104713589&scope=bot'
    })
  }
}

export function setToken (_token) {
  token = _token
}

export function getToken () {
  return token
}

window.customElements.define('login-board', LoginBoard)
