import React from 'react'

//Img-ref :- https://onlymyenglish.com/birds-name-english/
export const DropDown = (props) => {
    const handleValueChange = (e) => {
        props.setSelectedImage(e.target.value)
    }
  return (
    <select value={props.selectedImage} onChange={handleValueChange}>
        <option value="">select bird Name</option>
        <option value="https://i1.wp.com/onlymyenglish.com/wp-content/uploads/2020/11/Pigeon-min.png?resize=150%2C150&ssl=1">Pigeon</option>
        <option value="https://i1.wp.com/onlymyenglish.com/wp-content/uploads/2020/11/Peacock-min.png?resize=150%2C150&ssl=1">Peacock</option>
        <option value="https://i1.wp.com/onlymyenglish.com/wp-content/uploads/2020/11/eagle-min.png?resize=150%2C150&ssl=1">Eagle</option>
        <option value="https://i2.wp.com/onlymyenglish.com/wp-content/uploads/2020/11/Crane-min.png?resize=150%2C150&ssl=1">Crane</option>
        <option value="https://i0.wp.com/onlymyenglish.com/wp-content/uploads/2020/11/Penguin-min.png?resize=150%2C150&ssl=1">Penguine</option>
        <option value="https://i0.wp.com/onlymyenglish.com/wp-content/uploads/Hen-min.png?resize=150%2C150&ssl=1">Hen</option>
        <option value="https://i0.wp.com/onlymyenglish.com/wp-content/uploads/Cockatoo-min.png?resize=150%2C150&ssl=1">Cockatoo</option>
        
    </select>
  )
}
