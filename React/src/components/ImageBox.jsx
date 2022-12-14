import React from 'react'

export const ImageBox = (props) => {
  return (
    (props.selectedImage==="")?"No image selected":<img src={props.selectedImage} />
  )
}
