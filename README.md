# Welcome to Cart Backend

This projects provides seven different functionalities related to cart through it's 7 api endpoints .

## Get All Carts (Get request)

We get all the carts through this api endpoint.

```
/carts
```

## Get A Single Cart (Get request)

We get a single cart of specific cartId we provide through this api endpoint.

```
/carts/{id}
```

## Get Cart by userId (Get request)

We have to provide userId to get all carts of specific user.

```
/carts/{userId}
<img width="1030" alt="getByuser" src="https://github.com/krishna-p060/cartSST_OOPsExam/assets/113329860/7ff9c13d-83e9-450e-bd26-ccf4543deda2">

```

## Get Cart in a date range (Get request)
 
We get all carts between the given start and end dates, write date in YYYY-MM-DD format.

```
/carts?start={startDate}&end={endDate}
```

## Add new Cart (Post request)

Here we can add new Cart to database, in the body of the api we have to pass userId, date , array of Products.

```
/carts
```
## Update Cart (Put request)

Here we can update Cart in database, in api we have to pass cartId and in the body of the api we have to pass updated userId, date , array of Products.

```
/carts/{id}
```

## Delete Cart (Delete request)

We delete a single cart of specific cartId we provide through this api endpoint.

```
/carts/{id}
```

## MVC Architecture

Organized this application following the MVC (Model-View-Controller) pattern.


## There is no actual database, I used [FakeStoreApi](https://fakestoreapi.com/) as dummy database.
