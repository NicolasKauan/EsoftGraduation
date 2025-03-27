
fetch("https://pokeapi.co/api/v2/pokemon")
    .then(response => response.json())
    .then(data => {
        data.results.forEach(pokemon => {
            fetch(pokemon.url)
                .then(response => response.json())
                .then(details => {
                    let imagePokemon = details.sprites.front_default;

                    let img = document.getElementById("imgPkm");
                    img.src = imagePokemon;
                    img.alt = pokemon.name;

                    //document.body.appendChild(img);
            });
        });
    });