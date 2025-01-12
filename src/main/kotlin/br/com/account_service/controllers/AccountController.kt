package br.com.account_service.controllers

import br.com.account_service.dtos.inputs.CreateAccountInputDTO
import br.com.account_service.dtos.outputs.AccountOutputDTO
import br.com.account_service.services.AccountService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

@Controller("/accounts")
class AccountController(private val accountService: AccountService) {

    @Post
    fun create(@Body request: CreateAccountInputDTO): HttpResponse<AccountOutputDTO>{
        return  HttpResponse.created(accountService.create(request))
    }

}