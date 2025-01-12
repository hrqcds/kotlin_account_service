package br.com.account_service.dtos.inputs

import br.com.account_service.entities.Account
import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable

@Introspected
@Serdeable.Deserializable
data class CreateAccountInputDTO(
    val username: String
){
    companion object {
        fun generateAccount(data: CreateAccountInputDTO): Account {
            return Account(username = data.username)
        }
    }

}



