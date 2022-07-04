package com.example.sqlite_room.data

class UserRepository(private val userDao: UserDao) {
    val selectUsers = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}