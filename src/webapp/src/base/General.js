import React, { Component } from 'react'


 const General = {
    
    // obj : json objects    
    isExistNullWithStart : function(obj) {
        var converted = Object.entries(obj).map( ([key,value]) => ({id: key, value }) );

        for(var i = 0 ; i < converted.length ; i++) {
            
            if(converted[i].id.startsWith("rdb")){

                if(converted[i].value === ""){
                    return false;
                }

            }

        }

        return true;

    }
} 



export default General

