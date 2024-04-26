package com.testehan.springbootsimple

import org.springframework.data.repository.CrudRepository

interface UserCrudRepository : CrudRepository<User, String>