import React, { useEffect, useState } from "react";
import API from "../axios";
import "../App.css";

const Home = () => {
  const [products, setProducts] = useState([]);
  const [isLoading, setIsLoading] = useState(true);
  const [isError, setIsError] = useState(false);

  useEffect(() => {
    const fetchData = async () => {
      try {
        setIsLoading(true);
        setIsError(false);
        const response = await API.get("/products");
        setProducts(Array.isArray(response.data) ? response.data : []);
      } catch (error) {
        console.error("Error fetching data:", error);
        setIsError(true);
      } finally {
        setIsLoading(false);
      }
    };

    fetchData();
  }, []);

  if (isLoading) {
    return (
      <h2 className="text-center" style={{ padding: "10rem" }}>
        Loading products...
      </h2>
    );
  }

  if (isError) {
    return (
      <h2 className="text-center" style={{ padding: "10rem" }}>
        Something went wrong...
      </h2>
    );
  }

  return (
    <>
      <div className="grid">
        {products.map((product, index) => (
          <div
            className="card mb-3"
            key={product.id ?? `${product.name ?? "product"}-${index}`}
            style={{
              width: "270px",
              height: "210px",
              boxShadow: "0 4px 8px rgba(0,0,0,0.1)",
              borderRadius: "10px",
              overflow: "hidden",

              display: "flex",
              flexDirection: "column",
              justifyContent: "flex-start",
              alignItems: "stretch",
            }}
          >
            <div
              className="card-body"
              style={{
                flexGrow: 1,
                display: "flex",
                flexDirection: "column",
                justifyContent: "space-between",
                padding: "10px",
              }}
            >
              <div>
                <h5
                  className="card-title"
                  style={{ margin: "0 0 10px 0", fontSize: "1.2rem" }}
                >
                  {(product.name ?? "Unnamed Product").toUpperCase()}
                </h5>
                <i
                  className="card-brand"
                  style={{ fontStyle: "italic", fontSize: "0.8rem" }}
                >
                  {`by ${product.brand ?? "Unknown Brand"}`}
                </i>
              </div>
              <hr className="hr-line" style={{ margin: "10px 0" }} />
              <div className="home-cart-price">
                <h5
                  className="card-text"
                  style={{
                    fontWeight: "600",
                    fontSize: "1.1rem",
                    marginBottom: "5px",
                  }}
                >
                  <i className="bi bi-currency-rupee"></i>
                  {product.price ?? "N/A"}
                </h5>
              </div>
              <button
                className="btn-hover color-9"
                style={{ margin: "10px 25px 0px " }}
              >
                Add To Cart
              </button>
            </div>
          </div>
        ))}
      </div>
    </>
  );
};

export default Home;
