package com.petstore.processors;


public class Pet {
   /*
   * The class can be extended to implement the deserlization of Resassured Response. The POJO conversion.
   * */
    private Long id;
    private String name;
    public Pet() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

