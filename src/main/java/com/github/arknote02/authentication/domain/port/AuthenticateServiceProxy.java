package com.github.arknote02.authentication.domain.port;

import com.github.arknote02.authentication.domain.model.AccessToken;
import com.github.arknote02.authentication.domain.model.Credential;

public interface AuthenticateServiceProxy {

  AccessToken authenticate(Credential credential);
}
