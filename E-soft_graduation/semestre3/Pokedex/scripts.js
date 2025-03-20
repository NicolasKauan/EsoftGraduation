fetch("https://pokeapi.co/api/v2/pokemon").then(function(Request){
    return requestAnimationFrame.json()
}).then(function(response){
    console.log(responseBody)
})