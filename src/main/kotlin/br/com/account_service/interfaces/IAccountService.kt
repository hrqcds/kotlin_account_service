package br.com.account_service.interfaces

import br.com.account_service.dtos.inputs.CreateAccountInputDTO
import br.com.account_service.dtos.outputs.AccountOutputDTO

interface IAccountService {
    fun create(request: CreateAccountInputDTO ): AccountOutputDTO
}