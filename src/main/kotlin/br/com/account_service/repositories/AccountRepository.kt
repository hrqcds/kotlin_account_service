package br.com.account_service.repositories

import br.com.account_service.entities.Account
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface AccountRepository : JpaRepository<Account, Long> {
}