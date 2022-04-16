package com.github.arknote02.credential.domain.port;

import com.github.arknote02.credential.domain.model.LoginId;
import com.github.arknote02.credential.domain.model.StoredCredential;

public interface CredentialRepository {

  StoredCredential find(LoginId loginId);
}
