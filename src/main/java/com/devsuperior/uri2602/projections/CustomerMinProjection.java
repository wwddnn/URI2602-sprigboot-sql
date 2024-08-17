package com.devsuperior.uri2602.projections;

//the projection is Interface,  don't Class. define only fields that i want catch in database.
//Min because is the minimum
//search in google 'spring data projections' for more projections
public interface CustomerMinProjection {
    //name of fields in the form of get method
    //this interface that represents the projection of data that i want, in this case field name
    String getName();

}
