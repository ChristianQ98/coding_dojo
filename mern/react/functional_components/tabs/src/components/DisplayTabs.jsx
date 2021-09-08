import styles from './DisplayTabs.module.css';

const DisplayTabs = (props) => {
    const { allItems } = props;

    const showContent = (e, value) => {
        document.getElementById("content").innerHTML = value.content;
        console.log(value.content);
    }

    return (
        <div className={ styles }>
            { allItems.map( (item, index) =>
                <>
                    <button id={ styles.label } onClick={ (e) => showContent(e, item) } key={ index }>Tab {item.label}</button>
                </>
            ) }
            <div id="content" className={ styles.contentText }></div>
        </div>
    )
}

export default DisplayTabs;