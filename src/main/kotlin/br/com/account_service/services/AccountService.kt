package br.com.account_service.services

import br.com.account_service.dtos.inputs.CreateAccountInputDTO
import br.com.account_service.dtos.outputs.AccountOutputDTO
import br.com.account_service.interfaces.IAccountService
import br.com.account_service.repositories.AccountRepository
import jakarta.inject.Singleton

@Singleton
class AccountService(private val accountRepository: AccountRepository) : IAccountService {
    override fun create(request: CreateAccountInputDTO): AccountOutputDTO {
         val result = this.accountRepository.save(CreateAccountInputDTO.generateAccount(request))

        return  AccountOutputDTO.generate(result)
    }
}