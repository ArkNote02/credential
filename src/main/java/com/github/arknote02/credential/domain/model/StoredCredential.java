package com.github.arknote02.credential.domain.model;

import lombok.NonNull;

public record StoredCredential(@NonNull LoginId loginId, @NonNull HashedPassword hashedPassword) {

}
