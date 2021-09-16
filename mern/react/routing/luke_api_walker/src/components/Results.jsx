import { useParams } from "react-router";
import styles from './Results.module.css';
import axios from 'axios';
import { useEffect, useState } from "react";
import { useHistory } from "react-router";

const Results = ( props ) => {
    const { cat } = useParams();
    const { num } = useParams();
    const [ attributes, setAttributes ] = useState({});
    const history = useHistory();
    const DATE_OPTIONS = { year: 'numeric', month: 'short', day: 'numeric' };
        useEffect(() => {
            axios.get(`https://swapi.dev/api/${cat}/${num}`)
        .then(response => {
            console.log("------------", response.data)
            setAttributes(response.data);
        }).catch(err => {
            console.log(err);
            history.push("/404");
        }
        )}, [ cat, num, history ]);

    return (
        <>
        {/* <div>
            <p>{ JSON.stringify(attributes) }</p>
        </div> */}
        <div className={styles.main}>
                {cat === "people" && attributes ?
                    <>
                        <h1>{attributes.name}</h1>
                        <p><span>Height:</span> {attributes.height}</p>
                        <p><span>Mass:</span> {attributes.mass}</p>
                        <p><span>Hair Color:</span> {attributes.hair_color}</p>
                        <p><span>Skin Color:</span> {attributes.skin_color}</p>
                    </>
                    : <span></span>}
                
                {cat === "films" && attributes ?
                    <>
                        <h1>{attributes.title}</h1>
                        <p><span>Episode:</span> {attributes.episode_id}</p>
                        <p><span>Opening:</span> {attributes.opening_crawl}</p>
                        <p><span>Released:</span> {(new Date(attributes.release_date)).toLocaleDateString('en-US', DATE_OPTIONS)}</p>
                        <p><span>Producer:</span> {attributes.producer}</p>
                    </>
                    :<span></span>}

                {cat === "planets" && attributes ?
                    <>
                    <h1>{attributes.name}</h1>
                        <p><span>Climate:</span> {attributes.climate}</p>
                        <p><span>Diameter:</span> {attributes.diameter}</p>
                        <p><span>Orbital Period:</span> {attributes.orbital_period}</p>
                        <p><span>Population:</span> {attributes.population}</p>
                    </>
                    : <span></span>}

                {cat === "starships" && attributes ?
                    <>
                    <h1>{attributes.name}</h1>
                    <p><span>Cargo Capacity:</span> {attributes.cargo_capacity}</p>
                    <p><span>Model:</span> {attributes.model}</p>
                    <p><span>Manufacturer:</span> {attributes.manufacturer}</p>
                    <p><span>Cost in Credits:</span> {attributes.cost_in_credits}</p>
                </>
                :<span></span>}

                {cat === "species" && attributes ?
                <>
                <h1>{attributes.name}</h1>
                    <p><span>Average Height:</span> {attributes.average_height}</p>
                    <p><span>Average Lifespan:</span> {attributes.average_lifespan}</p>
                    <p><span>Classification:</span> {attributes.classification}</p>
                    <p><span>Language:</span> {attributes.language}</p>
                </>
                : <span></span>}

                {cat === "vehicles" && attributes ?
                    <>
                    <h1>{attributes.name}</h1>
                    <p><span>Cargo Capacity:</span> {attributes.cargo_capacity}</p>
                    <p><span>Model:</span> {attributes.model}</p>
                    <p><span>Manufacturer:</span> {attributes.manufacturer}</p>
                    <p><span>Cost in Credits:</span> {attributes.cost_in_credits}</p>
                    </>
                    :<span></span>}
            </div></>
    )
}

export default Results;