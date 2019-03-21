package com.example.cleancodesample.domain.usecase

interface UseCase<in Params, out Result> {
    fun execute(params: Params): Result
}