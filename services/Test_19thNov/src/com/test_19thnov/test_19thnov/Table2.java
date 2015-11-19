/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_19thnov.test_19thnov;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import java.util.Arrays;

import javax.persistence.Transient;
import javax.persistence.CascadeType;
import javax.persistence.UniqueConstraint;




/**
 * Table2 generated by hbm2java
 */
@Entity
@Table(name="`TABLE2`"
)
public class Table2  implements java.io.Serializable
 {


private Table1Id id;
private Table1 table1;

    public Table2() {
    }



     @EmbeddedId

    

    @AttributeOverrides( {
        @AttributeOverride(name="column2", column=@Column(name="`COLUMN2`", nullable=false) ), 
        @AttributeOverride(name="id", column=@Column(name="`ID`", nullable=false) ) } )
    public Table1Id getId() {
        return this.id;
    }
    
    public void setId(Table1Id id) {
        this.id = id;
    }

@OneToOne(fetch=FetchType.EAGER) @PrimaryKeyJoinColumn
    public Table1 getTable1() {
        return this.table1;
    }
    
    public void setTable1(Table1 table1) {
        this.table1 = table1;
    }



public boolean equals(Object o) {
         if (this == o)
         return true;
		 if ( (o == null ) )
		 return false;
		 if ( !(o instanceof Table2) )
		 return false;

		 Table2 that = ( Table2 ) o;

		 return ( (this.getId()==that.getId()) || ( this.getId()!=null && that.getId()!=null && this.getId().equals(that.getId()) ) );

   }

   public int hashCode() {
         int result = 17;

         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );

         return result;
     }


}
