# StructuredProductCatalogue
Hi there, this is my project StructuredProductCatalogue

//Project Instructions

In this project i have use java, spring boot with RestFulAPI and for database Integration i used MySQL database
I make entity, controller, service, repository 
In entity i make a product, categories, attributes, rating etc to make table in database
In controller i make a restfulapi CRUD operation with endpoints like ("/save"), etc , and aslo i give annotation @requestmapping which helps me to mapped the api endpoint.
In service i make a logic to save, update, delete product.
In repository where i can extend jpa repository for which i use inbuilt method like findAll, getById etc , and also in repository i make jpa custom method like FindByName.
I also add Spring security which is additional data information , in these security there is entity class, controller, service with security config class where the user password will be in encrypted form.
and those who have register in these only have to excess to see the data and also have to excess to update the data.
My project run on server port 9000.
I stored all types of Shoes product in details 
(http://localhost:9000/product/getAllProduct)
