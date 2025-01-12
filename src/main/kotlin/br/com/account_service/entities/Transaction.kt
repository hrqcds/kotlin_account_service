package br.com.account_service.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

@Entity(name = "transactions")
data class Transaction(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @Column(name = "account_number", length = 12, nullable = false)
    val accountNumber: String,

    @Column(length = 50, nullable = false)
    val merchant: String,

    @Column(name = "total_amount", nullable = false)
    val totalAmount: Double,

    @Column(nullable = false)
    val mcc: Int,

    @Column(nullable = false)
    val code: String,

    @Column(name = "transaction_date")
    val transactionDate: Date? = null
)
