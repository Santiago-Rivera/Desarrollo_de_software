import React, {useState} from 'react';
import PropTypes from 'prop-types';


const Fgreating = (props) => {
    const [age,setage] = useState(19);

    const birthday = () => {
        setage(age +1)
    }

    return (
        <div>
            <h1>
                    ¡Hola {"Santiago"} desde componente funcional!
                </h1>
                <h2>
                    Tu edad es de: {age}
                </h2>
                <div>
                    <button onClick={birthday}>
                        Cumplir años 
                    </button>
                </div>
        </div>
    );
};


Fgreating.propTypes = {
    name: PropTypes.string
};


export default Fgreating;
