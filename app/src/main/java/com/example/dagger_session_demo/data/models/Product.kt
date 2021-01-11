package com.example.dagger_session_demo.data.models

import javax.inject.Inject

data class Product @Inject constructor(val user: User)