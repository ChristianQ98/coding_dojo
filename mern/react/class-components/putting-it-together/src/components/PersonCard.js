import React, { Component } from 'react';

class PersonCard extends Component {
    constructor(props) {
        super(props);
        this.state = {
            age: this.props.age
        }
    }
    
    birthday = () => {
        this.setState({age: this.state.age + 1});
        // setState is an asynch function so it is always one behind
        // JS does not wait for it to finish
        console.log(this.state.age);
    }
    render() {
        return (
            <div>
                <h1>{this.props.lastName}, {this.props.firstName}</h1>
                <p>Age: {this.state.age}</p>
                <p>Hair color: {this.props.hairColor}</p>
                <button onClick={this.birthday} className="btn btn-primary">Birthday Button for {this.props.firstName} {this.props.lastName}</button>
            </div>
        )
    }
}

export default PersonCard;