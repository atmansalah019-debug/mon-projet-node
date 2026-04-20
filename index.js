"console.log('Hello Node');"
// index.js (branche dev)
function addition(a, b) {
	return a + b;
}
if (require.main === module){
	consol.log("Resultat:", addition(5, 4))
}
module.exports = { addition }


function addition(a, b) { 
return a + b; // simple addition 
} 
if (require.main === module) { 
console.log("Résultat:", addition(5, 3)); 
} 
module.exports = { addition }; 