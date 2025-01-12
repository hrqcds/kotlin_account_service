package br.com.account_service.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.util.*

@Entity(name = "accounts")
data class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String? = null,

    @Column(name = "account_number", length = 12, nullable = false, unique = true)
    val accountNumber: String,

    @Column(length = 25, nullable = false)
    val username: String,

    @Column(name = "amount_food", nullable = false)
    val amountFood: Double = 0.0,

    @Column(name = "amount_meal", nullable = false)
    val amountMeal: Double = 0.0,

    @Column(name = "amount_cash", nullable = false)
    val amountCash: Double = 0.0,

    @CreationTimestamp
    val createdAt: Date? = null,

    @UpdateTimestamp
    val updatedAt: Date? = null
    )
