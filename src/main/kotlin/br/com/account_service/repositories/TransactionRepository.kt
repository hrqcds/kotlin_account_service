package br.com.account_service.repositories

import br.com.account_service.entities.Transaction
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface TransactionRepository : JpaRepository<Transaction, String>
{
}