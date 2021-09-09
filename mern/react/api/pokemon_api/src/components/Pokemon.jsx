import React, { useEffect, useState } from 'react';
import axios from 'axios';
import styles from './Pokemon.module.css';

const Pokemon = (props) => {
    const [ pokemon, setPokemon ] = useState([]);

    useEffect(() => {
    }, []);

    // Fetch
    const fetchPokemon = () => {
        fetch("https://pokeapi.co/api/v2/pokemon/")
            .then(response => response.json())
            .then(jsonResponse => {
                console.log(jsonResponse)
                setPokemon(jsonResponse)
            })
            .catch(err => console.log(err))
    };

    // Axios
    const axiosPokemon = () => {
        axios.get("https://pokeapi.co/api/v2/pokemon/?limit=807")
        .then(response => {
            console.log(response.data.results)
            setPokemon(response.data.results)
        }).catch(err => console.log(err))
    };

    return (
        <div className={ styles.main }>
            {/* <div>
                <button onClick={ fetchPokemon } id={ styles.btn } className="btn btn-primary">Fetch Pokemon</button>
                <ol>
                    { pokemon.length === 0 ? <p className={ styles.initialMsg }>Click the button above to retrieve the Pokemon's names</p> : 
                    pokemon.results.map( (p, idx ) => <li key={ idx }> {p.name} </li>)}
                </ol>
            </div> */}
            <button onClick={ axiosPokemon } id={ styles.btn } className="btn btn-primary">Fetch Pokemon</button>
            <ol>
                    { pokemon.length === 0 ? <p className={ styles.initialMsg }>Click the button above to retrieve the Pokemon's names</p> : 
                    pokemon.map( (p, idx ) => <li key={ idx }> {p.name} </li>)}
                </ol>
        </div>
    )
}

export default Pokemon;