<html>
<body>
	<i>Bismillah Hirrahman Nirrahim</i>
	<br>
    <h2>Syed Muhammad Ali's RESTful Web Application!</h2>
    
    <p><a href="webapi/calculator">Calculator Resource</a>
    <p><a href="webapi/memory">Memory Resource</a>
    <p><a href="webapi/converter">Converter Resource</a>
    
    <p><a href="webapi/myresource">Default resource</a>
    
    
    
    CLIENT TESTING
    
        SERVICE 1: CALCULATOR
<form method="get" action="webapi/calculator/client">
Please enter 2 numbers, decimals are allowed: <input type="text"
name="param1"> and <input type="text" name="param2"> <br>
What operation would you like to do? <br>
<!-- <input type="text" name="op"><br>-->

<input type="radio" name="op" value="add" checked>Add<br>
<input type="radio" name="op" value="subtract">Subtract<br>
<input type="radio" name="op" value="multiply">Multiply<br>
<input type="radio" name="op" value="divide">Divide<br>

<input type="submit" value="Calculate">
</form>

SERVICE 2: MEMORY STORE
<form action="webapi/memory/client/save" method="get">
Please enter a number to store into memory: <input type="text"
name="value1"> <input type="submit"
value="=">
</form>
RETRIEVE MEMORY FROM STORE
<form action="webapi/memory/retrieve" method="get">
<input type="submit" name="retrieve" value="Show me stored number">
</form>

CLEAR MEMORY FROM STORE
<form action="webapi/memory/clear">
<input type="submit" name="clear" value="Clear Memory from store">
</form>


SERVICE 3: TO/FROM METRIC CONVERSION
<form action="webapi/converter/client">
Please enter a number to convert, decimals are allowed: <input type="text"
name="param1"><br>


<input type="radio" name="operation" value="FahrenheitToCelsius" checked>Fahrenheit To Celsius<br>
<input type="radio" name="operation" value="CelsiusToFahrenheit">Celsius To Fahrenheit<br>
<input type="radio" name="operation" value="MetreToFeet">Metre To Feet<br>
<input type="radio" name="operation" value="FeetToMetre">Feet To Metre<br>
<input type="radio" name="operation" value="MetreToYard">Metre To Yard<br>
<input type="radio" name="operation" value="YardToMetre">Yard To Metre<br>
<input type="radio" name="operation" value="KilometreToMile">Kilometre To Mile<br>
<input type="radio" name="operation" value="MileToKilometre">Mile To Kilometre<br>
<input type="radio" name="operation" value="KilogramtoPound">Kilogram to Pound<br>
<input type="radio" name="operation" value="PoundToKilogram">Pound To Kilogram<br>
<input type="submit" value="Convert now">
</form>
</body>
</html>
