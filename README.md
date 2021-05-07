# Hello, folks! <img src="https://raw.githubusercontent.com/MartinHeinz/MartinHeinz/master/wave.gif" width="30px">

My name is Okan and I'm a student of Computer Engineer. You can find me on [![LinkedIn][1.2]][1].

## System includes:
<ul>
  <li>JWT with Spring Security</li>
  <li>Registration and Login</li>
  <li>API</li>
  <li>Private and protected resources</li>
</ul>

## API Methods
<ul>
  <li>POST /api/auth/signup for signup new account</li>
  <li>POST /api/auth/signin for login an account</li>
  <li>GET /api/test/all for retrieve public content</li>
  <li>GET /api/test/user for access User's content</li>
  <li>GET /api/test/mod for access Moderator's content</li>
  <li>GET /api/test/admin for access Admin's content</li>
</ul>

## 🔧 Technologies & Tools
![](https://img.shields.io/badge/OS-Windows-Green?style=flat&logo=windows&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Editor-eclipse%20idea-blue.svg?style=flat&logo=eclipse%20ide&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Code-Java-informational?style=flat&logo=java&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Tools-Spring-informational?style=flat&logo=spring&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Tools-SpringSecurity-informational?style=flat&logo=spring&logoColor=white&color=2bbc8a)
![](https://img.shields.io/badge/Tools-MySQL-informational?style=flat&logo=mysql&logoColor=white&color=2bbc8a)

# About System
<div style="align:center; margin:5px;">
  <p>
    <p>Tables that we define in entites package will be automatically generated in database.</p>
      <img src="https://user-images.githubusercontent.com/67058617/117378717-a3dbdd00-aede-11eb-8f0c-fe2aba72003e.png" width="700" height="450"/>
  </p>
  
  <p>
    <p>We also need to add some rows into roles table before assigning any role to User.</p>
      <img src="https://user-images.githubusercontent.com/67058617/117378751-b6561680-aede-11eb-8a9b-8592dfa23aaf.png" width="700" height="350"/>
  </p>
  
  <p>
    <p>We can register with /signup API 
      <ul>
        <li>admin with ROLE_ADMIN</li>
        <li>mod with ROLE_MODERATOR</li>
        <li>user with ROLE_USER</li>
      </ul>
    </p>
      <img src="https://user-images.githubusercontent.com/67058617/117378771-c110ab80-aede-11eb-859b-2820194cbfc7.png" width="700" height="350"/>
  </p>
  
  <p>
    <p>After registration operation, our tables could look like this.</p>
      <img src="https://user-images.githubusercontent.com/67058617/117378775-c241d880-aede-11eb-936b-5af480cfd7db.png" width="700" height="350"/>
  </p>
  
  <p>
    <p>We have public and protected resources.
      <p>Public resource
        <ul><li>/api/test/all</li></ul>
      </p>
      <img src="https://user-images.githubusercontent.com/67058617/117442614-afabbb80-af3f-11eb-9a88-4b6ad87ca98b.png" width="700" height="350"/>
      <p>Protected resources
        <ul>
        <li>/api/test/user</li>
        <li>/api/test/mod</li>
        <li>/api/test/admin</li>
      </ul>
      </p>
    </p>
      <img src="https://user-images.githubusercontent.com/67058617/117442619-b1757f00-af3f-11eb-9a79-a5ead4392581.png" width="700" height="350"/>
      <p>We need sign in to access protected resources.</p>
      <p>POST /api/auth/signin</p>
      <img src="https://user-images.githubusercontent.com/67058617/117442876-044f3680-af40-11eb-92d0-4290c5c035be.png" width="700" height="350"/>
      <p>After signing in, we can access resources with token and its type depends on our roles.</p>
      <img src="https://user-images.githubusercontent.com/67058617/117443094-5001e000-af40-11eb-842b-8b25e109ec1e.png" width="700" height="350"/>
      <img src="https://user-images.githubusercontent.com/67058617/117443096-51330d00-af40-11eb-905d-98798dc623ed.png" width="700" height="350"/>
      <p>We have no permission to access admin content, so we need sign in with admin account.</p>
      <img src="https://user-images.githubusercontent.com/67058617/117454323-b130b000-af4e-11eb-9b08-f30b47ce1c02.png" width="700" height="350"/>
      <img src="https://user-images.githubusercontent.com/67058617/117454326-b1c94680-af4e-11eb-8ccb-0704a42dad38.png" width="700" height="350"/>
      <p>After signing in, we can access admin content.</p>
      <img src="https://user-images.githubusercontent.com/67058617/117443098-51cba380-af40-11eb-88fb-54a55a5f076e.png" width="700" height="350"/>
  </p>
  
</div>

## &#x1f4c8; GitHub Stats
[![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=vasseurr)](https://github.com/anuraghazra/github-readme-stats)

![Okan's GitHub stats](https://github-readme-stats.vercel.app/api?username=Vasseurr&show_icons=true&theme=dracula)

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=Vasseurr&repo=OWIS)](https://github.com/Vasseurr/OWIS)

[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=Vasseurr&repo=User-Authentication)](https://github.com/Vasseurr/User-Authentication)



<!-- links to social media icons -->

[1.1]: http://i.imgur.com/0o48UoR.png (github icon with padding)
[1.2]: https://img.icons8.com/plasticine/25/000000/linkedin.png (LinkedIn icon without padding)

<!-- links to your social media accounts -->

[1]: https://www.linkedin.com/in/okanruzgar/
[2]: https://github.com/Vasseurr
