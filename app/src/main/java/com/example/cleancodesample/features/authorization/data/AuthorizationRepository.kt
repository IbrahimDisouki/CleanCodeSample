package com.example.cleancodesample.features.authorization.data

import com.example.cleancodesample.features.authorization.domain.IAuthorizationRepository

class AuthorizationRepository(
    private val localDataSource: IAuthorizationLocalDataSource,
    private val remoteDataSource: IAuthorizationRemoteDataSource
) :
    IAuthorizationRepository {

}