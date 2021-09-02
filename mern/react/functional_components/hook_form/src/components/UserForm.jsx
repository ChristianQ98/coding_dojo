import React, { useState } from 'react';
import styles from './UserForm.module.css';

const UserForm = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, confirmPassword };
        console.log(`Welcome ${newUser}`);
    };

    return (
        <div className={ styles }>
            <form onSubmit={ createUser }>
                <div className="mb-3">
                    <label className="form-label">First Name</label>
                    <input className="form-control" type="text" onChange={ (e) => setFirstName(e.target.value) }/>
                </div>
                <div className="mb-3">
                    <label className="form-label">Last Name</label>
                    <input className="form-control" type="text" onChange={ (e) => setLastName(e.target.value) }/>
                </div>
                <div className="mb-3">
                    <label className="form-label">Email</label>
                    <input className="form-control" type="text" onChange={ (e) => setEmail(e.target.value) }/>
                </div>
                <div className="mb-3">
                    <label className="form-label">Password</label>
                    <input className="form-control" type="text" onChange={ (e) => setPassword(e.target.value) }/>
                </div>
                <div className="mb-3">
                    <label className="form-label">Confirm Password</label>
                    <input className="form-control" type="text" onChange={ (e) => setConfirmPassword(e.target.value) }/>
                </div>
                <button className="btn btn-primary" type="submit">Create User</button>
            </form>
            <div className={ styles.box }>
                <h4>Your form data</h4>
                <p>First Name: { firstName }</p>
                <p>Last Name: { lastName }</p>
                <p>Email: { email }</p>
                <p>Password: { password }</p>
                <p>Confirm Password: { confirmPassword }</p>
            </div>
        </div>
    )
}

export default UserForm;