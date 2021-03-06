# Unit Testing Documentation

Authors:

Date:

Version:

# Contents

- [Black Box Unit Tests](#black-box-unit-tests)




- [White Box Unit Tests](#white-box-unit-tests)


# Black Box Unit Tests

    <Define here criteria, predicates and the combination of predicates for each function of each class.
    Define test cases to cover all equivalence classes and boundary conditions.
    In the table, report the description of the black box test case and (traceability) the correspondence with the JUnit test case writing the 
    class and method name that contains the test case>
    <JUnit test classes must be in src/test/java/it/polito/ezshop   You find here, and you can use,  class TestEzShops.java that is executed  
    to start tests
    >

 ### **Class *UserClass* - method *setId***(Integer id)



**Criteria for method *setId*:**
	

 - value of id

   

**Predicates for method setId:**

| Criteria    | Predicate |
| ----------- | --------- |
| value of id | Any value |

 

**Combination of predicates**:


| value of id | Valid / Invalid | Description of the test case | JUnit test case            |
| ----------- | --------------- | ---------------------------- | -------------------------- |
| *           | Valid           | T1(2) -> void                | UserClassTest/ testSetId() |



 ### **Class *UserClass* - method *setUsername***(String Username)



**Criteria for method *setUsername*:**
	

 - value of userName

   

**Predicates for method setUserName:**

| Criteria          | Predicate |
| ----------------- | --------- |
| value of username | Any value |

 

**Combination of predicates**:


| value of username | Valid / Invalid | Description of the test case | JUnit test case                  |
| ----------------- | --------------- | ---------------------------- | -------------------------------- |
| *                 | Valid           | T1("newName") -> void        | UserClassTest/ testSetUserName() |



 ### **Class *UserClass* - method *setPassword***(String password)



**Criteria for method *setPassword*:**
	

 - value of password

   

**Predicates for method setPassword:**

| Criteria          | Predicate |
| ----------------- | --------- |
| value of password | Any value |

 

**Combination of predicates**:


| value of password | Valid / Invalid | Description of the test case | JUnit test case                  |
| ----------------- | --------------- | ---------------------------- | -------------------------------- |
| *                 | Valid           | T1("123") -> void            | UserClassTest/ testSetPassword() |





 ### **Class *UserClass* - method *setRole***(String role)



**Criteria for method *setRole*:**
	

 - value of role

   

**Predicates for method setRole:**

| Criteria      | Predicate |
| ------------- | --------- |
| value of role | Any value |

 

**Combination of predicates**:


| value of role | Valid / Invalid | Description of the test case | JUnit test case              |
| ------------- | --------------- | ---------------------------- | ---------------------------- |
| *             | Valid           | T1("Cashier") -> void        | UserClassTest/ testSetRole() |



 ### **Class *UserClass* - method *setSalt***(String salt)



**Criteria for method *setSalt*:**
	

 - value of salt

   

**Predicates for method setSalt:**

| Criteria      | Predicate |
| ------------- | --------- |
| value of salt | Any value |

 

**Combination of predicates**:


| value of salt | Valid / Invalid | Description of the test case | JUnit test case              |
| ------------- | --------------- | ---------------------------- | ---------------------------- |
| *             | Valid           | T1("abc") -> void            | UserClassTest/ testSetSalt() |



 ### **Class *CustomerClass* - method *setId***(Integer id)



**Criteria for method *setId*:**
	

 - value of id

   

**Predicates for method setId:**

| Criteria    | Predicate |
| ----------- | --------- |
| value of id | Any value |

 

**Combination of predicates**:


| value of id | Valid / Invalid | Description of the test case | JUnit test case                |
| ----------- | --------------- | ---------------------------- | ------------------------------ |
| *           | Valid           | T1(2) -> void                | CustomerClassTest/ testSetId() |



 ### **Class *CustomerClass* - method *setCustomerName***(String customerName)



**Criteria for method *setCustomerName*:**
	

 - value of customerName

   

**Predicates for method setUserName:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of customerName | Any value |

 

**Combination of predicates**:


| value of customerName | Valid / Invalid | Description of the test case | JUnit test case                          |
| --------------------- | --------------- | ---------------------------- | ---------------------------------------- |
| *                     | Valid           | T1("newName") -> void        | CustomerClassTest/ testSetCustomerName() |



 ### **Class *CustomerClass* - method *setCustomerCard***(String customerCard)



**Criteria for method *setCustomerCard*:**
	

 - value of customerCard

   

**Predicates for method setCustomerCard:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of customerCard | Any value |

 

**Combination of predicates**:


| value of customerCard | Valid / Invalid | Description of the test case | JUnit test case                          |
| --------------------- | --------------- | ---------------------------- | ---------------------------------------- |
| *                     | Valid           | T1("1234567891") -> void     | CustomerClassTest/ testSetCustomerCard() |





 ### **Class *CustomerClass* - method *setPoints***(Integer points)



**Criteria for method *setPoints*:**
	

 - value of points

   

**Predicates for method setPoints:**

| Criteria        | Predicate |
| --------------- | --------- |
| value of points | Any value |

 

**Combination of predicates**:


| value of points | Valid / Invalid | Description of the test case | JUnit test case                     |
| --------------- | --------------- | ---------------------------- | ----------------------------------- |
| *               | Valid           | T1(7) -> void                | CustomerClassTest/  testSetPoints() |

 ### **Class *BalanceOperationClass* - method *setBalanceId***(int balanceId)



**Criteria for method *setBalanceId*:**
	

 - value of balanceId

   

**Predicates for method setBalanceId:**

| Criteria           | Predicate |
| ------------------ | --------- |
| value of balanceId | Any value |

 

**Combination of predicates**:


| value of balanceId | Valid / Invalid | Description of the test case | JUnit test case                           |
| ------------------ | --------------- | ---------------------------- | ----------------------------------------- |
| *                  | Valid           | T1(7) -> void                | ProductTypeClassTest/  testSetBalanceId() |



 ### **Class *BalanceOperationClass* - method *setDate***(LocalDate date)



**Criteria for method *setDate*:**
	

 - value of date

   

**Predicates for method setDate:**

| Criteria      | Predicate |
| ------------- | --------- |
| value of date | Any value |

 

**Combination of predicates**:


| value of date | Valid / Invalid | Description of the test case | JUnit test case                      |
| ------------- | --------------- | ---------------------------- | ------------------------------------ |
| *             | Valid           | T1(new LocalDate()) -> void  | ProductTypeClassTest/  testSetDate() |



 ### **Class *BalanceOperationClass* - method *setType***(String type)



**Criteria for method *setType*:**
	

 - value of type

   

**Predicates for method setType:**

| Criteria      | Predicate |
| ------------- | --------- |
| value of type | Any value |

 

**Combination of predicates**:


| value of type | Valid / Invalid | Description of the test case | JUnit test case                      |
| ------------- | --------------- | ---------------------------- | ------------------------------------ |
| *             | Valid           | T1("type") -> void           | ProductTypeClassTest/  testSetType() |



 ### **Class *BalanceOperationClass* - method *setMoney***(double money)



**Criteria for method *setMoney*:**
	

 - value of money

   

**Predicates for method   setMoney:**

| Criteria       | Predicate |
| -------------- | --------- |
| value of money | Any value |

 

**Combination of predicates**:


| value of money | Valid / Invalid | Description of the test case | JUnit test case                       |
| -------------- | --------------- | ---------------------------- | ------------------------------------- |
| *              | Valid           | T1(30.5) -> void             | ProductTypeClassTest/  testSetMoney() |

 ### **Class *ProductTypeClass* - method *setQuantity***(Integer quantity)



**Criteria for method *setQuantity*:**
	

 - value of quantity

   

**Predicates for method setQuantity:**

| Criteria          | Predicate |
| ----------------- | --------- |
| value of quantity | Any value |

 

**Combination of predicates**:


| value of quantity | Valid / Invalid | Description of the test case | JUnit test case                          |
| ----------------- | --------------- | ---------------------------- | ---------------------------------------- |
| *                 | Valid           | T1(30) -> void               | ProductTypeClassTest/  testSetQuantity() |





 ### **Class *ProductTypeClass* - method *setLocation***(String location)



**Criteria for method *setLocation*:**
	

 - value of location

   

**Predicates for method setLocation:**

| Criteria          | Predicate |
| ----------------- | --------- |
| value of location | Any value |

 

**Combination of predicates**:


| value of location | Valid / Invalid | Description of the test case | JUnit test case                          |
| ----------------- | --------------- | ---------------------------- | ---------------------------------------- |
| *                 | Valid           | T1("location") -> void       | ProductTypeClassTest/  testSetLocation() |



 ### **Class *ProductTypeClass* - method *setNote***(String note)



**Criteria for method *setNote*:**
	

 - value of note

   

**Predicates for method setNote:**

| Criteria      | Predicate |
| ------------- | --------- |
| value of note | Any value |

 

**Combination of predicates**:


| value of note | Valid / Invalid | Description of the test case | JUnit test case                      |
| ------------- | --------------- | ---------------------------- | ------------------------------------ |
| *             | Valid           | T1("note") -> void           | ProductTypeClassTest/  testSetNote() |



 ### **Class *ProductTypeClass* - method *setProductDescription***(String description)



**Criteria for method *setProductDescription*:**
	

 - value of description

   

**Predicates for method setProductDescription:**

| Criteria             | Predicate |
| -------------------- | --------- |
| value of description | Any value |

 

**Combination of predicates**:


| value of description | Valid / Invalid | Description of the test case | JUnit test case                                    |
| -------------------- | --------------- | ---------------------------- | -------------------------------------------------- |
| *                    | Valid           | T1("description") -> void    | ProductTypeClassTest/  testSetProductDescription() |



 ### **Class *ProductTypeClass* - method *setBarCode***(String barCode)



**Criteria for method *setBarCode*:**
	

 - value of barCode

   

**Predicates for method setBarCode:**

| Criteria             | Predicate |
| -------------------- | --------- |
| value of description | Any value |

 

**Combination of predicates**:


| value of barcode | Valid / Invalid | Description of the test case | JUnit test case                         |
| ---------------- | --------------- | ---------------------------- | --------------------------------------- |
| *                | Valid           | T1("1234567890987") -> void  | ProductTypeClassTest/  testSetBarCode() |



 ### **Class *ProductTypeClass* - method *setPricePerUnit***(Double pricePerUnit)



**Criteria for method *setPricePerUnit*:**
	

 - value of pricePerUnit

   

**Predicates for method setPricePerUnit:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of pricePerUnit | Any value |

 

**Combination of predicates**:


| value of pricePerUnit | Valid / Invalid | Description of the test case | JUnit test case                           |
| --------------------- | --------------- | ---------------------------- | ----------------------------------------- |
| *                     | Valid           | T1(0.30) -> void             | ProductTypeClassTest/  testPricePerUnit() |





 ### **Class *ProductTypeClass* - method *setId***(Double Id)



**Criteria for method *setId*:**
	

 - value of id

   

**Predicates for method setPricePerUnit:**

| Criteria    | Predicate |
| ----------- | --------- |
| value of id | Any value |

 

**Combination of predicates**:


| value of id | Valid / Invalid | Description of the test case | JUnit test case                    |
| ----------- | --------------- | ---------------------------- | ---------------------------------- |
| *           | Valid           | T1(3) -> void                | ProductTypeClassTest/  testSetId() |



 ### **Class *OrderClass* - method *setProductCode***(String productCode)



**Criteria for method *setProductCode*:**
	

 - value of productCode

   

**Predicates for method setProductCode:**

| Criteria             | Predicate |
| -------------------- | --------- |
| value of productCode | Any value |

 

**Combination of predicates**:


| value of productCode | Valid / Invalid | Description of the test case | JUnit test case                       |
| -------------------- | --------------- | ---------------------------- | ------------------------------------- |
| *                    | Valid           | T1("1000439112766") -> void  | OrderClassTest/  testSetProductCode() |



 ### **Class *OrderClass* - method *setPricePerUnit***(String pricePerUnit)



**Criteria for method *setPricePerUnit*:**
	

 - value of pricePerUnit

   

**Predicates for method setPricePerUnit:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of pricePerUnit | Any value |

 

**Combination of predicates**:


| value of pricePerUnit | Valid / Invalid | Description of the test case | JUnit test case                        |
| --------------------- | --------------- | ---------------------------- | -------------------------------------- |
| *                     | Valid           | T1(0.30) -> void             | OrderClassTest/  testSetPricePerUnit() |





 ### **Class *OrderClass* - method *setQuantity***(int quantity)



**Criteria for method *setQuantity*:**
	

 - value of quantity

   

**Predicates for method setQuantity:**

| Criteria          | Predicate |
| ----------------- | --------- |
| value of quantity | Any value |

 

**Combination of predicates**:


| value of quantity | Valid / Invalid | Description of the test case | JUnit test case                    |
| ----------------- | --------------- | ---------------------------- | ---------------------------------- |
| *                 | Valid           | T1(30) -> void               | OrderClassTest/  testSetQuantity() |



 ### **Class *OrderClass* - method *setStatus***(String status)



**Criteria for method *setStatus*:**
	

 - value of status

   

**Predicates for method setStatus:**

| Criteria        | Predicate |
| --------------- | --------- |
| value of status | Any value |

 

**Combination of predicates**:


| value of status | Valid / Invalid | Description of the test case | JUnit test case                  |
| --------------- | --------------- | ---------------------------- | -------------------------------- |
| *               | Valid           | T1("closed") -> void         | OrderClassTest/  testSetStatus() |



 ### **Class *OrderClass* - method *setOrderId***(Integer orderId)



**Criteria for method *setOrderId*:**
	

 - value of orderId

   

**Predicates for method setOrderId:**

| Criteria         | Predicate |
| ---------------- | --------- |
| value of orderId | Any value |

 

**Combination of predicates**:


| value of orderId | Valid / Invalid | Description of the test case | JUnit test case                   |
| ---------------- | --------------- | ---------------------------- | --------------------------------- |
| *                | Valid           | T1(30) -> void               | OrderClassTest/  testSetOrderId() |







 ### **Class *OrderClass* - method *setBalanceId***(Integer balanceId)



**Criteria for method *setBalanceId*:**
	

 - value of balanceId

   

**Predicates for method setBalanceId:**

| Criteria           | Predicate |
| ------------------ | --------- |
| value of balanceId | Any value |

 

**Combination of predicates**:


| value of balanceId | Valid / Invalid | Description of the test case | JUnit test case                     |
| ------------------ | --------------- | ---------------------------- | ----------------------------------- |
| *                  | Valid           | T1(30) -> void               | OrderClassTest/  testSetBalanceId() |





 ### **Class *OrderClass* - method *setMoney***(double money)



**Criteria for method *setMoney*:**
	

 - value of setMoney

   

**Predicates for method setMoney:**

| Criteria       | Predicate |
| -------------- | --------- |
| value of money | Any value |

 

**Combination of predicates**:


| value of money | Valid / Invalid | Description of the test case | JUnit test case                 |
| -------------- | --------------- | ---------------------------- | ------------------------------- |
| *              | Valid           | T1(30.0) -> void             | OrderClassTest/  testSetMoney() |

 ### **Class *EZShop* - method *createRandomInteger***(int aStart, long aEnd, Random aRandom)



**Criteria for method *createRandomInteger*:**
	

 - order of aStart and aEnd

 - validity of aRandom

   

**Predicates for method setRole:**

| Criteria                 | Predicate             |
| ------------------------ | --------------------- |
| order of aStart and aEnd | aStart > aEnd invalid |
|                          | aStart <= aEnd valid  |
| validity of aRandom      | == null invalid       |
|                          | != null valid         |

 

**Boundaries :**

| Criteria                 | Boundary values |
| ------------------------ | --------------- |
| order of aStart and aEnd | aStart = aEnd   |



**Combination of predicates**:


| aStart <= aEnd | order of aStart and aEnd | Valid / Invalid | Description of the test case                                 | JUnit test case                                          |
| -------------- | ------------------------ | --------------- | ------------------------------------------------------------ | -------------------------------------------------------- |
| *              | aStart > aEnd            | Invalid         | T1(10,1,new Random()) - > IllegalArgumentException           | EZShopTest/ testCreateRandomIntegerWithUnValidArgument() |
| != null        | aStart <= aEnd           | Valid           | T2(1,10,new Random()) ->String  T3b(2,2,newRandom()) -> String | EZShopTest/                  testCreateRandomInteger()   |
| == null        | *                        | Invalid         | T4(1,10,null) -> NullPointerException                        | EZShopTest/ testCreateRandomIntegerWithNullRandom()      |



 ### **Class *EZShop* - method *onlyDigits***(String str)



**Criteria for method *createRandomInteger*:**

 - value of str

   

**Predicates for method setRole:**

| Criteria     | Predicate                   |
| ------------ | --------------------------- |
| value of str | only digits valid           |
|              | null valid                  |
|              | only characters valid       |
|              | digits and characters valid |



**Combination of predicates**:


| value of str          | Valid / Invalid | Description of the test case | JUnit test case                                |
| --------------------- | --------------- | ---------------------------- | ---------------------------------------------- |
| only digits           | Valid           | T1("1234") - > true          | EZShopTest/ testOnlyDigits()                   |
| == null               | Valid           | T2(null) ->false             | EZShopTest/ testOnlyDigitsNull()               |
| only characters       | Valid           | T3("askjdfhkshf") -> false   | EZShopTest/ testOnlyDigitsWithChars()          |
| digits and characters | Valid           | T4("12as987dffg34") -> false | EZShopTest/ testOnlyDigitsWithCharsAndDigits() |



 ### **Class *EZShop* - method *checkLuhn***(String cardNo)



**Criteria for method *checkLuhn*:**

 - value of str

   

**Predicates for method checkLuhn:**

| Criteria        | Predicate                  |
| --------------- | -------------------------- |
| value of cardNo | valid (luhn format)        |
|                 | not valid (no luhn format) |
|                 | null not valid             |



**Combination of predicates**:


| value of cardNo | Valid / Invalid | Description of the test case    | JUnit test case                  |
| --------------- | --------------- | ------------------------------- | -------------------------------- |
| luhn format     | Valid           | T1("4005550000000019") - > true | EZShopTest/ testCheckLuhnValid() |
| not luhn format | Invalid         | T3("1111111111") ->false        | EZShopTest/ testCheckLuhnNull()  |
| null            | Invalid         | T3(null) ->Exception            | testCheckLuhnInvalid()           |



 ### **Class *EZShop* - method *checkValidityProductcode***(String productCode)



**Criteria for method *checkValidityProductcode*:**

 - value of str

   

**Predicates for method checkValidityProductcode:**

| Criteria             | Predicate                  |
| -------------------- | -------------------------- |
| value of productCode | valid (goodformat)         |
|                      | not valid (no good format) |
|                      | null not valid             |



**Combination of predicates**:


| value of productCode | Valid / Invalid | Description of the test case | JUnit test case                             |
| -------------------- | --------------- | ---------------------------- | ------------------------------------------- |
| Good format          | Valid           | T1("0799439112766") - > true | EZShopTest/ testCheckGoodBarcodeFormat()    |
| not Good format      | Invalid         | T3("1111111111") ->false     | EZShopTest/ testCheckNotGoodBarcodeFormat() |
| null                 | Invalid         | T3(null) ->false             | testCheckInvalidBarcodeFormat()             |



 ### **Class *ReturnTransactionClass* - method *setReturnId***(Integer id)



**Criteria for method *setReturnId*:**
	

 - value of id

   

**Predicates for method setReturnId:**

| Criteria    | Predicate |
| ----------- | --------- |
| value of id | Any value |

 

**Combination of predicates**:


| Criteria    | Valid / Invalid | Description of the test case | JUnit test case   |
| ----------- | --------------- | ---------------------------- | ----------------- |
| value of id | Valid           | T1(7) -> void                | testSetReturnId() |

 ### **Class *ReturnTransactionClass* - method *setPrice***(Integer price)



**Criteria for method *setPrice*:**
	

 - value of price

   

**Predicates for method setPrice:**

| Criteria       | Predicate |
| -------------- | --------- |
| value of price | Any value |

 

**Combination of predicates**:


| Criteria       | Valid / Invalid | Description of the test case | JUnit test case |
| -------------- | --------------- | ---------------------------- | --------------- |
| value of price | Valid           | T1(7) -> void                | testSetPrice()  |

 ### Class *ReturnTransactionClass* - method setState(String state)



**Criteria for method *setState*:**
	

 - value of state

   

**Predicates for method setState:**

| Criteria       | Predicate |
| -------------- | --------- |
| value of state | Any value |

 

**Combination of predicates**:


| Criteria       | Valid / Invalid | Description of the test case | JUnit test case |
| -------------- | --------------- | ---------------------------- | --------------- |
| value of state | Valid           | T1("state") -> void          | testsetState()  |

 ### 

 ### **Class *ReturnTransactionClass* - method *setEntries***(ArrayList<TicketEntry> entries)



**Criteria for method *setEntries*:**
	

 - value of entries

   

**Predicates for method setEntries:**

| Criteria         | Predicate |
| ---------------- | --------- |
| value of entries | Any value |

 

**Combination of predicates**:


| Criteria         | Valid / Invalid | Description of the test case | JUnit test case  |
| ---------------- | --------------- | ---------------------------- | ---------------- |
| value of entries | Valid           | T1(entries) -> void          | testSetEntries() |

 ### **Class *ReturnTransactionClass* - method *setTicketNumber***(Integer TicketNumber)



**Criteria for method *setTicketNumber*:**
	

 - value of TicketNumber

   

**Predicates for method setTicketNumber:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of TicketNumber | Any value |

 

**Combination of predicates**:


| Criteria              | Valid / Invalid | Description of the test case | JUnit test case       |
| --------------------- | --------------- | ---------------------------- | --------------------- |
| value of TicketNumber | Valid           | T1(1) -> void                | testSetTicketNumber() |

 ### **Class *SaleTransactionClass* - method *setTicketNumber***(Integer TicketNumber)



**Criteria for method *setTicketNumber*:**
	

 - value of TicketNumber

   

**Predicates for method setTicketNumber:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of TicketNumber | Any value |

 

**Combination of predicates**:


| Criteria              | Valid / Invalid | Description of the test case | JUnit test case       |
| --------------------- | --------------- | ---------------------------- | --------------------- |
| value of TicketNumber | Valid           | T1(7) -> void                | testSetTicketNumber() |

 ### **Class *SaleTransactionClass* - method *setEntries***(ArrayList<TicketEntry> entries)



**Criteria for method *setEntries*:**
	

 - value of entries

   

**Predicates for method setEntries:**

| Criteria         | Predicate |
| ---------------- | --------- |
| value of entries | Any value |

 

**Combination of predicates**:


| Criteria         | Valid / Invalid | Description of the test case | JUnit test case  |
| ---------------- | --------------- | ---------------------------- | ---------------- |
| value of entries | Valid           | T1(entries) -> void          | testSetEntries() |

 ### **Class *SaleTransactionClass* - method *setDiscountRate***(double discountRate)



**Criteria for method *setDiscountRate*:**
	

 - value of discount rate

   

**Predicates for method setDiscountRate:**

| Criteria               | Predicate |
| ---------------------- | --------- |
| value of discount rate | Any value |

 

**Combination of predicates**:


| Criteria               | Valid / Invalid | Description of the test case | JUnit test case       |
| ---------------------- | --------------- | ---------------------------- | --------------------- |
| value of discount rate | Valid           | T1(7) -> void                | testSetDiscountRate() |

 ### **Class *SaleTransactionClass* - method *setPrice***(double price)



**Criteria for method *setPrice*:**
	

 - value of price

   

**Predicates for method setPrice:**

| Criteria       | Predicate |
| -------------- | --------- |
| value of price | Any value |

 

**Combination of predicates**:


| Criteria       | Valid / Invalid | Description of the test case | JUnit test case  |
| -------------- | --------------- | ---------------------------- | ---------------- |
| value of price | Valid           | T1(7) -> void                | testSetEntries() |

 ### **Class *SaleTransactionClass* - method *setState***(String state)



**Criteria for method *setState*:**
	

 - value of state

   

**Predicates for method setState:**

| Criteria       | Predicate |
| -------------- | --------- |
| value of state | Any value |

 

**Combination of predicates**:


| Criteria       | Valid / Invalid | Description of the test case | JUnit test case |
| -------------- | --------------- | ---------------------------- | --------------- |
| value of state | Valid           | T1("state") -> void          | testSetState()  |

 ### **Class *TicketEntryClass* - method *setId***(Integer id)



**Criteria for method *setId*:**
	

 - value of id

   

**Predicates for method setId:**

| Criteria    | Predicate |
| ----------- | --------- |
| value of id | Any value |

 

**Combination of predicates**:


| value of id | Valid / Invalid | Description of the test case | JUnit test case |
| ----------- | --------------- | ---------------------------- | --------------- |
| value of id | Valid           | T1(2) -> void                | testSetId()     |

 ### **Class *TicketEntryClass* - method *setBarCode***(String BarCode)



**Criteria for method setBarCode**
	

 - value of BarCode

   

**Predicates for method setBarCode:**

| Criteria         | Predicate |
| ---------------- | --------- |
| value of BarCode | Any value |

 

**Combination of predicates**:


| value of id      | Valid / Invalid | Description of the test case | JUnit test case  |
| ---------------- | --------------- | ---------------------------- | ---------------- |
| value of BarCode | Valid           | T1("2") -> void              | testSetBarCode() |

 ### **Class *TicketEntryClass* - method *setProductDescription***(String productDescription)



**Criteria for method setProductDescription**
	

 - value of ProductDescription

   

**Predicates for method setProductDescription:**

| Criteria                    | Predicate |
| --------------------------- | --------- |
| value of ProductDescription | Any value |

 

**Combination of predicates**:


| value of id                 | Valid / Invalid | Description of the test case | JUnit test case             |
| --------------------------- | --------------- | ---------------------------- | --------------------------- |
| value of ProductDescription | Valid           | T1("pane") -> void           | testSetProductDescription() |

 ### **Class *TicketEntryClass* - method *setAmount***(double amount)



**Criteria for method *setAmount*:**
	

 - value of Amount

   

**Predicates for method setAmount:**

| Criteria        | Predicate |
| --------------- | --------- |
| value of Amount | Any value |

 

**Combination of predicates**:


| Criteria        | Valid / Invalid | Description of the test case | JUnit test case |
| --------------- | --------------- | ---------------------------- | --------------- |
| value of Amount | Valid           | T1(7) -> void                | testSetAmount() |

 ### **Class *TicketEntryClass* - method *setPricePerUnit***(double pricePerUnit)



**Criteria for method *setPricePerUnit*:**
	

 - value of PricePerUnit

   

**Predicates for method setPricePerUnit:**

| Criteria              | Predicate |
| --------------------- | --------- |
| value of PricePerUnit | Any value |

 

**Combination of predicates**:


| Criteria              | Valid / Invalid | Description of the test case | JUnit test case       |
| --------------------- | --------------- | ---------------------------- | --------------------- |
| value of PricePerUnit | Valid           | T1(7) -> void                | testSetPricePerUnit() |

 ### **Class *TicketEntryClass* - method *setDiscountRate***(double discountRate)



**Criteria for method *setDiscountRate*:**
	

 - value of discount rate

   

**Predicates for method setDiscountRate:**

| Criteria               | Predicate |
| ---------------------- | --------- |
| value of discount rate | Any value |

 

**Combination of predicates**:


| Criteria               | Valid / Invalid | Description of the test case | JUnit test case       |
| ---------------------- | --------------- | ---------------------------- | --------------------- |
| value of discount rate | Valid           | T1(7) -> void                | testSetDiscountRate() |

 ### **Class *EZShop* - method *computePriceForProducts***(ArrayList<TicketEntryClass products)



**Criteria for method *computePriceForProducts*:**
	

 - value of products

   

**Predicates for method computePriceForProducts:**

| Criteria          | Predicate         |
| ----------------- | ----------------- |
| value of products | null INVALID      |
|                   | empty list VALID  |
|                   | many object VALID |

 

**Combination of predicates**:


| value of products | Valid / Invalid | Description of the test case | JUnit test case                        |
| ----------------- | --------------- | ---------------------------- | -------------------------------------- |
| null              | Invalid         | T1(null) ->0.0               | testComputePriceForProductsWithNull()  |
| empty             | Valid           | T2("") -> 0.0                | testComputePriceForProductsWithEmpty() |
| manyObject        | Valid           | T3(products)                 | testComputePriceForProductsWithMany()  |



 ### **Class *EZShop* - method *checkIfValidRole***(String role)



**Criteria for method *checkIfValidRole*:**
	

 - value of role

   

**Predicates for method checkIfValidRole:**

| Criteria      | Predicate             |
| ------------- | --------------------- |
| value of role | null INVALID          |
|               | empty INVALID         |
|               | "Administrator" VALID |
|               | "Cashier" VALID       |
|               | "ShopManager" VALID   |
|               | other string INVALID  |

 

**Combination of predicates**:


| value of role   | Valid / Invalid | Description of the test case | JUnit test case                     |
| --------------- | --------------- | ---------------------------- | ----------------------------------- |
| null            | Invalid         | T1(null) ->false             | testCheckIfValidRoleNull()          |
| empty           | Invalid         | T2("") -> false              | testCheckIfValidRoleEmpty()         |
| "Administrator" | Valid           | T3("Administrator") -> true  | testCheckIfValidRoleAdministrator() |
| "Cashier"       | Valid           | T4("Cashier") -> true        | testCheckIfValidRoleCashier()       |
| "ShopManager"   | Valid           | T5("ShopManager") -> true    | testCheckIfValidRoleShopManager()   |
| other string    | Invalid         | T6("BankManager") -> false   | testCheckIfValidRoleShopOther()     |





 ### **Class *EZShop* - method *checkLocation***(String location)



**Criteria for method *checkLocation*:**
	

 - value of location

   

**Predicates for method checkLocation:**

| Criteria          | Predicate                                   |
| ----------------- | ------------------------------------------- |
| value of location | null INVALID                                |
|                   | empty INVALID                               |
|                   | DIGIT + "-" + ALPHABETH + "-" + DIGIT VALID |
|                   | other string INVALID                        |

 

**Combination of predicates**:


| value of role                           | Valid / Invalid | Description of the test case | JUnit test case                   |
| --------------------------------------- | --------------- | ---------------------------- | --------------------------------- |
| null                                    | Invalid         | T1(null) ->false             | testCheckLocationNull()           |
| empty                                   | Invalid         | T2("") -> false              | testCheckLocationEmpty            |
| "DIGIT + "-" + ALPHABETH + "-" + DIGIT" | Valid           | T3("12-AAA-32") -> true      | testCheckLocationCorrect          |
| other string                            | Invalid         | T4(" - - ") -> false         | testCheckLocationOnlySpace        |
|                                         | ""              | T5(" -a- ") -> false         | testCheckLocationOnlyAlpha        |
|                                         | ""              | T5("12-a-12 ") -> false      | testCheckLocationSpaceInsideDigit |



 ### **Class *HashGenerator* - method *passwordMatches(String dbHashedPass, String password, String salt)



**Criteria for method *passwordMatches*:**
	

 - matching of password and dbHashedPass

   

**Predicates for method checkLocation:**

| Criteria                              | Predicate   |
| ------------------------------------- | ----------- |
| matching of password and dbHashedPass | True valid  |
|                                       | False valid |

 

**Combination of predicates**:


| matching of password and dbHashedPass | Valid / Invalid | Description of the test case             | JUnit test case       |
| ------------------------------------- | --------------- | ---------------------------------------- | --------------------- |
| True                                  | valid           | T1(hashedPass, "newPass" ,salt) ->true   | testPasswordMatches() |
| False                                 | valid           | T2(hashedPass, "NewPass", salt) -> false | testPasswordMatches() |



 ### **Class *HashGenerator* - method *hashPassword(final char[] password, final byte[] salt, final int iterations, final int keyLength)



**Criteria for method *passwordMatches*:**
	

 - value of parameters

   

**Predicates for method checkLocation:**

| Criteria            | Predicate |
| ------------------- | --------- |
| value of parameters | Any value |

 

**Combination of predicates**:


| value of parameters | Valid / Invalid | Description of the test case                                 | JUnit test case    |
| ------------------- | --------------- | ------------------------------------------------------------ | ------------------ |
| any value           | valid           | T1(passwordChars, saltBytes, iterations, keyLengtht) ->byte[] | testHashPassword() |





# White Box Unit Tests

### Test cases definition

    <JUnit test classes must be in src/test/java/it/polito/ezshop>
    <Report here all the created JUnit test cases, and the units/classes under test >
    <For traceability write the class and method name that contains the test case>


| Unit name                            | JUnit test case                               |
| ------------------------------------ | --------------------------------------------- |
| EZShopTest/ checkValidityProductcode | EZShopTest/ TestCheckValidityLongProductcode  |
| EZShopTest/ checkValidityProductcode | EZShopTest/ testCheckValidityShortProductcode |


### Code coverage report

![](Images/covarage.png)


### Loop coverage analysis


| Unit name                                               | Loop rows | Number of iterations | JUnit test case                      |
| ------------------------------------------------------- | --------- | -------------------- | ------------------------------------ |
| EZShop/ computePriceForProducts(ArrayList<TicketEntry>) | 797       | 0                    | testComputePriceForProductsWithEmpty |
|                                                         |           | 1                    | testComputePriceForProductWithOnes   |
|                                                         |           | 3                    | testComputePriceForProductsWithMany  |
| EZShop/CheckLuhnInvalid(String CardNo)                  | 1365      | 0                    | testCheckLuhnEmpthy()                |
|                                                         |           | 1                    | testCheckLuhnOne()                   |
|                                                         |           | 2                    | testCheckLuhnTwo()                   |
|                                                         |           | 15                   | testCheckLuhnValid()                 |

