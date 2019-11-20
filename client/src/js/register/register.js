import { getAccessToken } from '../app.js'

const template = document.createElement('template')
template.innerHTML = `
<label for="username">Username</label>
<input type="text" id="username" name="username" placeholder="Username" />
<label for="firstname">First Name</label>
<input type="text" id="firstname" name="firstname" placeholder="First Name" />
<label for="lastname">Last Name</label>
<input type="text" id="lastname" name="lastname" placeholder="Last Name" />
<label for="password">Password</label>
<input type="password" id="password" name="password" placeholder="Password" />
<input type="submit" id="submit" value="Register" />
`
let token
export class Register extends window.HTMLElement {
  constructor () {
    super()

    this.attachShadow({ mode: 'open' })
    this.shadowRoot.appendChild(template.content.cloneNode(true))
  }

  connectedCallback () {
    this.register()
  }

  register () {
    const submit = this.shadowRoot.querySelector('#submit')
    const username = this.shadowRoot.querySelector('#username')
    const firstname = this.shadowRoot.querySelector('#firstname')
    const lastname = this.shadowRoot.querySelector('#lastname')
    const password = this.shadowRoot.querySelector('#password')
    submit.addEventListener('click', async event => {
      const accessToken = getAccessToken()
      console.log(accessToken)
      await fetch('http://localhost:8080/register', {
        method: 'POST',
        headers: {
          'Content-type': 'application/json'
        },
        body: JSON.stringify({
          username: username.value,
          firstName: firstname.value,
          lastName: lastname.value,
          slackToken: '' + getAccessToken(),
          password: password.value
        })
      })
    })
  }
}

export function setTokenRegister (_token) {
  token = _token
}

export function getTokenRegister () {
  return token
}

window.customElements.define('register-board', Register)
