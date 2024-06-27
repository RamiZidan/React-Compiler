import React from 'react';
const a = 3 ;
b = 4 ;
z = {x:3 ,y:4};
const products = [ {x:3}, 2 , 3 ];
const ProductList = () => {
  const [state , setState] = useState({x:3});
  // const ref = useRef();
  useEffect(()=>{
    const x = 3;
    
  },[]);
  return <>
    <div>
      <h1>Product List</h1>
      {products . map( ( product ) => {
        return <div key={product.id}>
          <h2>{product.name}</h2>
          <p>Price {product.price}</p>
        </div>
      })}
    </div>
  </>;
};

export default ProductList;
