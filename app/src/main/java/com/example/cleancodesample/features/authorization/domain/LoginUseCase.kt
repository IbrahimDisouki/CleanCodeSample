package com.example.cleancodesample.features.authorization.domain

import com.example.cleancodesample.domain.usecase.UseCase
import com.example.cleancodesample.features.authorization.domain.LoginUseCase.Params

class LoginUseCase(val respoitory: IAuthorizationRepository) : UseCase<Params, Any> {

    override fun execute(params: Params): Any {
        return Any()
    }

    class Params private constructor(val email: String, val password: String) {
        companion object {
            fun create(email: String, password: String) =
                Params(email, password)
        }
    }
}