package com.github.arknote02.credential.domain.port;

import com.github.arknote02.credential.domain.model.AccessToken;
import com.github.arknote02.credential.domain.model.Credential;

public interface AuthenticateServiceProxy {

  AccessToken authenticate(Credential credential);
}
