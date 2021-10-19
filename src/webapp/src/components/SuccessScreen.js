import React, { Component } from 'react'
import "../App.css"
import {Alert, Container, Row, Col, Form, Card, Button , FormLabel} from 'react-bootstrap'


export default function SuccessScreen() {
    return (
        <div className="App">
            <header className="App-header">
                <Card style={{backgroundColor:"transparent"}}>
                    <Card.Title>
                        Göstermiş olduğunuz ilgi için teşekkür ederiz.
                    </Card.Title>
                    <Card.Body>
                        KTU Farabi Hastanesi
                    </Card.Body>
                </Card>
            </header>
            </div>
    )
}

