import React, { useState } from 'react';
import styles from './UserForm.module.css';

const UserForm = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [confirmPassword, setConfirmPassword] = useState("");

    const [firstNameError, setFirstNameError] = useState("");
    const [lastNameError, setLastNameError] = useState("");
    const [emailError, setEmailError] = useState("");
    const [passwordError, setPasswordError] = useState("");
    const [confirmPasswordError, setConfirmPasswordError] = useState("");

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, confirmPassword };
        console.log(`Welcome ${newUser}`);
    };

    const handleFirstName = (e) => {
        setFirstName(e.target.value);
        if(e.target.value.length < 2) {
            setFirstNameError("First name must be 2 characters or longer!");
        } else {
            setFirstNameError("");
        }
    }

    const handleLastName = (e) => {
        setLastName(e.target.value);
        if(e.target.value.length < 2) {
            setLastNameError("Last name must be 2 characters or longer!");
        } else {
            setLastNameError("");
        }
    }

    const handleEmail = (e) => {
        setEmail(e.target.value);
        if(e.target.value.length < 5) {
            setEmailError("Email must be 5 characters or longer!");
        } else {
            setEmailError("");
        }
    }

    const handlePassword = (e) => {
        setPassword(e.target.value);
        if(e.target.value.length < 8) {
            setPasswordError("Password must be 8 characters or longer!");
        } else {
            setPasswordError("");
        }
    }

    const handleConfirmPassword = (e) => {
        setConfirmPassword(e.target.value);
        if(e.target.value !== password) {
            setConfirmPasswordError("Passwords must match!")
        } else {
            setConfirmPasswordError("");
        }
    }

    return (
        <div className={ styles }>
            <form onSubmit={ createUser }>
                <div className="mb-3">
                    <label className="form-label">First Name</label>
                    <input className="form-control" type="text" onChange={ handleFirstName }/>
                    {
                        firstNameError ? <p className={ styles.error }>{firstNameError}</p> : <span>&nbsp;</span>
                    }
                </div>
                <div className="mb-3">
                    <label className="form-label">Last Name</label>
                    <input className="form-control" type="text" onChange={ handleLastName }/>
                    {
                        lastNameError ? <p className={ styles.error }>{lastNameError}</p> : <span>&nbsp;</span>
                    }
                </div>
                <div className="mb-3">
                    <label className="form-label">Email</label>
                    <input className="form-control" type="text" onChange={ handleEmail }/>
                    {
                        emailError ? <p className={ styles.error }>{emailError}</p> : <span>&nbsp;</span>
                    }
                </div>
                <div className="mb-3">
                    <label className="form-label">Password</label>
                    <input className="form-control" type="text" onChange={ handlePassword }/>
                    {
                        passwordError ? <p className={ styles.error }>{passwordError}</p> : <span>&nbsp;</span>
                    }
                </div>
                <div className="mb-3">
                    <label className="form-label">Confirm Password</label>
                    <input className="form-control" type="text" onChange={ handleConfirmPassword }/>
                    {
                        confirmPasswordError ? <p className={ styles.error }>{confirmPasswordError}</p> : <span>&nbsp;</span>
                    }
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