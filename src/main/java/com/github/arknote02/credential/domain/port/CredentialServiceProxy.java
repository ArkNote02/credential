package com.github.arknote02.credential.domain.port;

import com.github.arknote02.credential.domain.model.AccessToken;
import com.github.arknote02.credential.domain.model.Credential;
import com.github.arknote02.credential.domain.model.LoginId;

public interface CredentialServiceProxy {

  AccessToken authenticate(Credential credential);

  LoginId authenticate(AccessToken accessToken);
}
