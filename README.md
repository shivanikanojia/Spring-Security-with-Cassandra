# Spring Security OAuth 2 Resource-Client Demo with Cassandra
OAuth 2 is an authorization framework that enables applications to obtain limited access to user accounts on an HTTP service, such as Facebook, GitHub and Google. It works by delegating user authentication to the service that hosts the user account, and authorizing third-party applications to access the user account. OAuth 2 provides authorization flows for web and desktop applications, and mobile devices.
OAuth defines four roles:

Resource Owner:-he resource owner is the user who authorizes an application to access their account.

Client:- The client is the application that wants to access the user's account. Before it may do so, it must be authorized by          
    the user, and the authorization must be validated by the API.

Resource Server:- The resource server hosts the protected user accounts

Authorization Server:-authorization server verifies the identity of the user then issues access tokens to the application.

Flow of OAuth 2:-
  
  1. The application requests authorization to access service resources from the user.
  2. If the user authorized the request, the application receives an authorization grant.
  3. The application requests an access token from the authorization server (API) by presenting authentication of its
		    own identity, and the authorization grant.
  4. If the application identity is authenticated and the authorization grant is valid, the authorization server (API)
      		issues an access token to the application. Authorization is complete.
  5. The application requests the resource from the resource server (API) and presents the access token for  \
		    authentication.
  6. If the access token is valid, the resource server (API) serves the resource to the application
  
An access token is a string representing an authorization issued to the client.The responsibility of access token is to access data before it gets expired.

Refresh token is issued (along with access token) to the client by the authorization server and is used to obtain a new access token when the current access token becomes invalid or expires, or to obtain additional access tokens with identical or narrower scope.

To create authorization server using spring security oauth2 module, we need to use annotation @EnableAuthorizationServer and extend the class AuthorizationServerConfigurerAdapter.

Spring security oauth exposes two endpoints for checking tokens (/oauth/check_token and /oauth/token_key) which are by default protected behind denyAll(). tokenKeyAccess() and checkTokenAccess() methods open these endpoints for use.

To create resource server component, use @EnableResourceServer annotation and extend the ResourceServerConfigurerAdapter class.

The resource server also provide a mechanism to authenticate users themselves. It will be a form based login in most cases.
