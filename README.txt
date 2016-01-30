You can see the source code to understand all the subresources available or you can do the following: https://cp8202-sali-rest.herokuapp.com/{one of: calculator, memory, converter}/{type anything to know a list of subresources for the primary resource}. 


Example: https://cp8202-sali-rest.herokuapp.com/converter/{one of: 'FahrenheitToCelsius', 'CelsiusToFahrenheit', 'MetreToFeet', 'FeetToMetre'}/param1

or https://cp8202-sali-rest.herokuapp.com/calculator/{one of: add, subtract, multiply, divide}/param1/param2

You can also use a REST POST client to use POST function of 'memory' service, in order to save a custom value to memory. Access at https://cp8202-sali-rest.herokuapp.com/memory through your REST client.
