package br.com.account_service.dtos.outputs

import br.com.account_service.entities.Account
import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable

@Introspected
@Serdeable.Serializable
data class AccountOutputDTO(
    val accountNumber: Long?,

    val username: String,

    val amountFood: Double,

    val amountMeal: Double,

    val amountCash: Double,

    val totalAmount: Double
){

    companion object {
        fun generate(data: Account): AccountOutputDTO{
            val total = data.amountMeal + data.amountMeal + data.amountFood
            return AccountOutputDTO(
                username = data.username,
                amountCash = data.amountCash,
                amountFood = data.amountFood,
                amountMeal = data.amountMeal,
                accountNumber = data.accountNumber,
                totalAmount = total
            )
        }
    }

}
