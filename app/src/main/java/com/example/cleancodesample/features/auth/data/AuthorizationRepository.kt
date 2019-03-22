package com.example.cleancodesample.features.auth.data

import com.example.cleancodesample.features.auth.domain.IAuthorizationRepository

class AuthorizationRepository(
        private val localDataSource: IAuthorizationLocalDataSource,
        private val remoteDataSource: IAuthorizationRemoteDataSource
) :
        IAuthorizationRepository {

}