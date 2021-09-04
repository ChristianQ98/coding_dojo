import styles from "./DisplayList.module.css";

const DisplayList = (props) => {
  console.log(props);
  const { list, handleIsDone, deleteItem } = props;
  return (
    <fieldset>
      <div>
        <h1>To Do:</h1>
        {list.length > 0 ? (
          list.map((i, idx) => (
            <li key={idx}>
              <label
                style={{ textDecoration: i.isDone ? "line-through" : "none" }}
                onClick={(e) => handleIsDone(idx)}
              >
                {i.item}
              </label>
              <input
                type="checkbox"
                checked={i.isDone}
                onChange={(e) => handleIsDone(idx)}
              />
              <button
                className="btn btn-dark"
                id={styles.delete}
                onClick={(e) => deleteItem(idx)}
              >
                Delete
              </button>
            </li>
          ))
        ) : <p style={{ fontWeight: "bold" }}>Currently nothing to do</p>}
      </div>
    </fieldset>
  );
};

export default DisplayList;
