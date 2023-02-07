module jmp.cloud.bank.impl {
    requires transitive jmp.bank.api;
    requires jmp.dao;
    exports com.epam.cloud;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires jmp.dto;
}