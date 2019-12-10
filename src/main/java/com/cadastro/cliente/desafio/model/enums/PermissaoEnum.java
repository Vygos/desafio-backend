package com.cadastro.cliente.desafio.model.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public enum PermissaoEnum {

    ADMIN(1, "ADMIN"),
    COMUM(2, "COMUM");


    PermissaoEnum(Integer id, String permissao) {
        this.id = id;
        this.permissao = permissao;
    }

    private final Integer id;
    private final String permissao;

    private static Map<Integer, PermissaoEnum> CACHE = new HashMap<>();


    static{
        Arrays.asList(PermissaoEnum.values()).forEach(permissao -> CACHE.put(permissao.getId(), permissao));
    }

    /*
    * Method to return permission enum
    * */
    public PermissaoEnum getPermissao(Integer id){
        return CACHE.get(id);
    }

    public Integer getId() {
        return id;
    }

    public String getPermissao() {
        return permissao;
    }


}
