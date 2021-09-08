import styles from './DisplayBox.module.css'

const DisplayBox = (props) => {
    const { allBoxes } = props;

    let isColor = require('is-color');

    return (
        <div className={ styles.flex }>
            { allBoxes.filter(box => isColor(box.color) === true).map( (box,idx) => 
                <span key={ idx } className={ styles.box } style={{ backgroundColor: box.color, width: box.width + "vw", height: box.height + "vh" }}></span>    
            ) }
        </div>
    )
}

export default DisplayBox;